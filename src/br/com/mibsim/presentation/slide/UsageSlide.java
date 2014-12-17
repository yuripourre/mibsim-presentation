package br.com.mibsim.presentation.slide;

import br.com.etyllica.animation.scripts.FadeInAnimation;
import br.com.etyllica.core.graphics.Graphic;
import br.com.etyllica.layer.ImageLayer;
import br.com.mibsim.presentation.CommonSlide;

public class UsageSlide extends CommonSlide {
	
	private ImageLayer roomba;
	
	private ImageLayer spirit;
		
	public UsageSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		super.load();
		
		roomba = new ImageLayer(26, 162, "more/roomba.png");
		
		FadeInAnimation roombaAnimation = new FadeInAnimation(roomba, 3000, 5000);
		scene.addAnimation(roombaAnimation);
				
		spirit = new ImageLayer(725, 300, "more/spirit.png");
		
		FadeInAnimation spiritAnimation = new FadeInAnimation(spirit, 6000, 5000);
		scene.addAnimation(spiritAnimation);
		
		loading = 100;
	}
		
	@Override
	public void draw(Graphic g) {
		super.draw(g);
				
		drawTitle(g, "Uso de robôs autônomos");
		drawSentence(g, 1, "Tarefas domésticas");
		drawSentence(g, 3, "Viagens a marte");
		
		roomba.draw(g);
		spirit.draw(g);
	}
		
	@Override
	public void nextSlide() {
		nextApplication = new ProblemsSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new MotivationSlide(w, h);
	}

}
