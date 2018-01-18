package assessment;

import guiTeacher.GUIApplication;

public class AssessmentGUI extends GUIApplication{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3469324092991574989L;

	public AssessmentGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		AssessmentGUI assessment = new AssessmentGUI(800, 800);
		Thread runner = new Thread(assessment);
		runner.start();
	}

	@Override
	public void initScreen() {
		AssessmentScreen screen = new AssessmentScreen(getWidth(), getHeight());
		setScreen(screen);
	}
}
