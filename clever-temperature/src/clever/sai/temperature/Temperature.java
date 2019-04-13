package clever.sai.temperature;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Temperature extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5112196577569990549L;
	public static final int childSize = 6;

	public Temperature() {
		setLayout(new GridLayout(8, 1));

		JPanel parent = new JPanel(new FlowLayout(1, 40, 1));
		JPanel child1 = new JPanel(new FlowLayout(1, 40, 10));
		JPanel child2 = new JPanel(new FlowLayout(1, 40, 10));
		JPanel child3 = new JPanel(new FlowLayout(1, 40, 10));
		JPanel child4 = new JPanel(new FlowLayout(1, 40, 10));
		JPanel child5 = new JPanel(new FlowLayout(1, 40, 10));
		JPanel child6 = new JPanel(new FlowLayout(1, 40, 10));
		JPanel tail = new JPanel(new FlowLayout(1, 40, 10));

		JLabel label = CleverSwingUtil.getNameLabel("Clever-SAI", 14, Color.RED);
		JPanel minInner = CleverSwingUtil.getMinOrMax("min", 14);
		JPanel maxInner = CleverSwingUtil.getMinOrMax("max", 14);
		JButton compute = new JButton("计算");
		parent.add(label);
		parent.add(minInner);
		parent.add(maxInner);
		parent.add(compute);
		add(parent);

		child1.add(CleverSwingUtil.getChild("SAI-SAI-1", 13, Color.BLACK));
		add(child1);
		child2.add(CleverSwingUtil.getChild("SAI-SAI-2", 13, Color.BLACK));
		add(child2);
		child3.add(CleverSwingUtil.getChild("SAI-SAI-3", 13, Color.BLACK));
		add(child3);
		child4.add(CleverSwingUtil.getChild("SAI-SAI-4", 13, Color.BLACK));
		add(child4);
		child5.add(CleverSwingUtil.getChild("SAI-SAI-5", 13, Color.BLACK));
		add(child5);
		child6.add(CleverSwingUtil.getChild("SAI-SAI-6", 13, Color.BLACK));
		add(child6);

		tail = new JPanel();
		JLabel tailText = CleverSwingUtil.getNameLabel("Clever-SAI", 15, Color.MAGENTA);
		tail.add(tailText);
		add(tail);

	}

}
