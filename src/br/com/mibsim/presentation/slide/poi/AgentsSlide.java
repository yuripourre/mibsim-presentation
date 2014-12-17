package br.com.mibsim.presentation.slide.poi;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;
import br.com.mibsim.presentation.slide.proposal.DescriptionSlide;

public class AgentsSlide extends CommonSlide {
	
	public AgentsSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		super.load();
		
		//draw more complex agentes acting
				
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
				
		drawTitle(g, "Agentes");

		drawSentence(g, 0, "Os agentes são os seres que habitam o MibSim.");
		drawSentence(g, 1, "Eles interagem com as bases estratégicas e ");
		drawSentence(g, 2, "com as fontes de nutrientes.");
		drawSentence(g, 3, "O papel principal dos agentes é explorar o mapa;");
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new SpeciesSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new DescriptionSlide(w, h);
	}

}
