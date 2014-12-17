package br.com.mibsim.presentation.slide.proposal;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class ApplicationSlide extends CommonSlide {

	public ApplicationSlide(int w, int h) {
		super(w, h);
	}
	
	@Override
	public void load() {
		super.load();
		
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
				
		drawTitle(g, "Aplicação");
		drawSentence(g, 0, "Para colocar a teoria em prática");
		drawSentence(g, 1, "eis que surge o simulador MibSim, onde:");
		drawSentence(g, 2, "Agentes = Alienígenas");
		drawSentence(g, 3, "Energia = Nutrientes");
		
	}

	@Override
	public void nextSlide() {
		nextApplication = new DescriptionSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new RequirementsSlide(w, h);
	}
	
}
