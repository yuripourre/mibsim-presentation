package br.com.mibsim.presentation;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.etyllica.context.Application;
import br.com.etyllica.core.event.GUIEvent;
import br.com.etyllica.core.event.KeyEvent;
import br.com.etyllica.core.graphics.Graphic;
import br.com.etyllica.core.loader.FontLoader;
import br.com.etyllica.linear.PointInt2D;
import br.com.mibsim.editor.WraparoundGrid;
import br.com.mibsim.editor.ZergGrid;
import br.com.mibsim.planning.PlanningAction;
import br.com.mibsim.planning.PlanningTask;
import br.com.mibsim.specie.BlueLurker;
import br.com.mibsim.specie.GreenUltralisk;
import br.com.mibsim.specie.RedHydralisk;
import br.com.mibsim.specie.Speciemen;

public class CommonSlide extends Application implements Slide {

	protected int quantity = 0;
	
	protected Font font;

	private WraparoundGrid grid;

	private boolean isFontSet = false;

	private List<Speciemen> bugs = new ArrayList<Speciemen>();

	public CommonSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {

		font = FontLoader.getInstance().loadFont("Suplexmentary_Comic_NC.ttf");

		grid = new ZergGrid(w, h);

		for(int i = 0; i < quantity; i++) {
			generateRandomBug();
		}

		updateAtFixedRate(200);

		loading = 10;
	}

	@Override
	public void timeUpdate(long now) {
		for(Speciemen bug: bugs) {
			bug.update(now);
		}
	}

	private void generateRandomBug() {

		Random random = new Random();

		PointInt2D point = generateRandomPosition();

		int specie = random.nextInt(3);

		Speciemen bug = null;

		if(specie == 1) {
			bug = new GreenUltralisk(point.getX(), point.getY(), null);
		} else if(specie == 2) {
			bug = new BlueLurker(point.getX(), point.getY(), null);
		} else if(specie == 0) {
			bug = new RedHydralisk(point.getX(), point.getY(), null);
		}

		generateRandomTask(bug);

		bugs.add(bug);
	}

	private PointInt2D generateRandomPosition() {

		Random random = new Random();

		int positioning = random.nextInt(4);

		int border = 40;

		PointInt2D point = new PointInt2D();
		
		switch (positioning) {
		case 0:
			point.setLocation(-random.nextInt(border), random.nextInt(h));
			break;
		case 1:
			point.setLocation(random.nextInt(w), -random.nextInt(border));
			break;
		case 2:
			point.setLocation(w+random.nextInt(border), random.nextInt(h));
			break;
		case 3:
			point.setLocation(random.nextInt(w), h+random.nextInt(border));
			break;
		}
		
		return point;
	}


	public void generateRandomTask(Speciemen bug) {

		Random random = new Random();

		int x = random.nextInt(w);
		int y = random.nextInt(h);

		bug.addTask(new PlanningTask(PlanningAction.REPORT, generateRandomPosition()));
		bug.addTask(new PlanningTask(PlanningAction.EXPLORE, new PointInt2D(x, y)));
	}

	@Override
	public void draw(Graphic g) {
		grid.draw(g);

		if(!isFontSet)
			setupFont(g);

		for(Speciemen bug: bugs) {
			bug.draw(g, 0, 0);
		}
	}

	private void setupFont(Graphic g) {
		g.setFont(font);
		g.setBasicStroke(6f);
		g.setShadowColor(Color.BLACK);
		g.setColor(Color.WHITE);
	}

	@Override
	public GUIEvent updateKeyboard(KeyEvent event) {
		if(event.isAnyKeyDown(KeyEvent.TSK_SPACE, KeyEvent.TSK_RIGHT_ARROW, KeyEvent.TSK_JOYSTICK_RIGHT))
			nextSlide();

		else if(event.isAnyKeyDown(KeyEvent.TSK_LEFT_ARROW, KeyEvent.TSK_JOYSTICK_LEFT))
			previousSlide();

		return GUIEvent.NONE;
	}

	protected void drawTitle(Graphic g, String text) {
		g.setFontSize(80);
		g.drawStringBorderX(text, 110);
	}

	protected void drawSentence(Graphic g, double index, String text) {
		g.setFontSize(40);
		g.drawStringBorderX(text, 210+(int)(70*index));
	}

	@Override
	public void nextSlide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void previousSlide() {
		// TODO Auto-generated method stub

	}

}
