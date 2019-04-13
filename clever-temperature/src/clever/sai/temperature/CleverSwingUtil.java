package clever.sai.temperature;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CleverSwingUtil extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3073268117002817321L;
	public static final String FONT_TYPE = "Dialog";

	public static JLabel getNameLabel(String name, int fontSize, Color color) {
		JLabel label = new JLabel(name);
		label.setFont(new Font(FONT_TYPE, 1, fontSize));
		label.setForeground(color);
		return label;
	}

	public static JPanel getParent(String name, int fontSize, Color color) {
		JPanel panel = new JPanel();
		JLabel label = getNameLabel("Clever-SAI", fontSize, color);
		JPanel minInner = getMinOrMax("min", fontSize);
		JPanel maxInner = getMinOrMax("max", fontSize);
		JButton compute = new JButton("ËÆ°ÁÆó");
		panel.add(label);
		panel.add(minInner);
		panel.add(maxInner);
		panel.add(compute);
		return panel;
	}

	public static JPanel getMinOrMax(String type, int fontSize) {
		JPanel panel = new JPanel();
		JTextField textField = new JTextField("", 10);
		JLabel minOrMax = null;
		if (type.equals("min")) {
			minOrMax = new JLabel("Êú?Â∞èÂ??");
		} else if (type.equals("max")) {
			minOrMax = new JLabel("Êú?Â§ßÂ??");
		}
		minOrMax.setForeground(Color.BLACK);
		minOrMax.setFont(new Font(FONT_TYPE, 0, fontSize));
		panel.add(minOrMax);
		panel.add(textField);
		return panel;
	}

	public static JPanel getChild(String name, int fontSize, Color color) {
		JPanel child = new JPanel(new FlowLayout(1, 40, 10));
		JLabel label = getNameLabel(name, fontSize, color);
		JPanel minInner = getMinOrMax("min", fontSize);
		JPanel maxInner = getMinOrMax("max", fontSize);
		child.add(label);
		child.add(minInner);
		child.add(maxInner);
		return child;
	}

}
