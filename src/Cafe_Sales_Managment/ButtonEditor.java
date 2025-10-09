/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafe_Sales_Managment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import Cafe_Sales_Managment.MenuUI;


public class ButtonEditor extends DefaultCellEditor {

    protected JButton btn;
    private String label;
    private boolean clicked;
    private JTable table;
    private MenuUI menuUI; // reference to MenuUI

    public ButtonEditor(JTextField txt, MenuUI menuUI) {
        super(txt);
        this.menuUI = menuUI;

        btn = new JButton();
        btn.setOpaque(true);

        btn.addActionListener(e -> fireEditingStopped());
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
    boolean isSelected, int row, int col) {
        this.table = table;
        label = (value == null) ? "Add" : value.toString();
        btn.setText(label);
        clicked = true;
        return btn;
    }

    @Override
    public Object getCellEditorValue() {
        if (clicked) {
            String item = table.getValueAt(table.getSelectedRow(), 0).toString();
            String category = table.getValueAt(table.getSelectedRow(), 1).toString();
            int price = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 2).toString());

            // Add to cart in MenuUI
            menuUI.addToCart(item, category, price);
        }
        clicked = false;
        return label;
    }

    @Override
    public boolean stopCellEditing() {
        clicked = false;
        return super.stopCellEditing();
    }

    @Override
    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }
}
