package assessment;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class AssessmentScreen extends FullFunctionScreen{

	private int score;
	private Button button;
	private TextArea scoreArea;
	private TextArea textArea;
	
	public AssessmentScreen(int width, int height) {
		super(width, height);
		score = 0;
		// TODO Auto-generated constructor stub
	}
	
	public void initAllObjects(List<Visible>viewObjects) {
		textArea = new TextArea(200, 300, 100, 50, "");
		scoreArea = new TextArea(200, 250, 100, 50, "Score: " + score);
		button = new Button(200, 200, 100, 50, "READY", new Action() {
			public void act() {
				button.setEnabled(false);
				Thread countdown = new Thread(new Runnable() {
					public void run() {
						for(int i = 3; i > 0; i--) {
							textArea.setText(i + "...");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						textArea.setText("GO!");
						button.setText("Click me!");
						button.setEnabled(true);
						button.setAction(new Action() {
							public void act() {
								score++;
								scoreArea.setText("Score: " + score);
							}
						});
						Thread timer = new Thread(new Runnable() {
							public void run() {
								for(int i = 5; i > 0; i--) {
									textArea.setText(i + "...");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
								textArea.setText(0 + "...");
								button.setEnabled(false);
								button.setText("Done");
							}
						});
						timer.start();
					}
				});
			countdown.start();
			}
		});
		
		viewObjects.add(button);
		viewObjects.add(textArea);
		viewObjects.add(scoreArea);
	}
}
		
