package br.com.mibsim.presentation.slide.poi;

import br.com.etyllica.animation.scripts.FadeInAnimation;
import br.com.etyllica.core.graphics.Graphic;
import br.com.etyllica.layer.ImageLayer;
import br.com.mibsim.presentation.CommonSlide;

public class SpeciesSlide extends CommonSlide {
	
	private ImageLayer ultralisk;
	private ImageLayer hydralisk;
	private ImageLayer lurker;
	
	public SpeciesSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		super.load();
		
		int offsetX = 620;
		ultralisk = new ImageLayer(offsetX, 210, "more/ultralisk.png");
		hydralisk = new ImageLayer(offsetX, 290, "more/hydralisk.png");
		lurker = new ImageLayer(offsetX, 370, "more/lurker.png");
		
		scene.addAnimation(new FadeInAnimation(ultralisk, 3000, 5000));
		scene.addAnimation(new FadeInAnimation(hydralisk, 6000, 5000));
		scene.addAnimation(new FadeInAnimation(lurker, 9000, 5000));
		
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
		
		drawTitle(g, "Espécies");
		drawSentence(g, 1, "Ultralisk");
		drawSentence(g, 2, "Hydralisk");
		drawSentence(g, 3, "Lurker");
		
		hydralisk.draw(g);
		ultralisk.draw(g);
		lurker.draw(g);
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new BasementsSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new AgentsSlide(w, h);
	}

}
