package clever.sai.temperature;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class CleverView extends JFrame {

	private static final long serialVersionUID = 3141138631330651758L;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrame frame = UserView.getInstance();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				Dimension frameSize = frame.getSize();
				if (frameSize.height > screenSize.height) {
					frameSize.height = screenSize.height;
				}
				if (frameSize.width > screenSize.width) {
					frameSize.width = screenSize.width;
				}
				frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
			}
		});
	}

	static class UserView extends JFrame {
		
		private static final long serialVersionUID = -5671584715083720562L;

		private static UserView instance = new UserView();
		private static final int DEFAULT_WIDTH = 600;
		private static final int DEFAULT_HEIGHT = 450;

		public UserView() {
			setTitle("CleverSAI");
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
			JTabbedPane tabbedPane = new JTabbedPane();
			tabbedPane.add("model-one", new Temperature());
			tabbedPane.add("model-two", new Temperature());
			add(tabbedPane, "Center");
		}

		public static UserView getInstance() {
			return instance;
		}
	}
}
