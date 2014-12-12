package br.com.mibsim.presentation.slide.proposal;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;
import br.com.mibsim.presentation.slide.UsageSlide;

public class ComparisonSlide extends CommonSlide {

	public ComparisonSlide(int w, int h) {
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
				
		drawTitle(g, "Mibsim");
		drawSentence(g, 0, "Para transformar a teoria em prática");
		drawSentence(g, 1, "eis que surge o MibSim, onde:");
		drawSentence(g, 2, "Agentes = Alienígenas");
		drawSentence(g, 3, "Energia = Nutrientes");
		
	}

	@Override
	public void nextSlide() {
		nextApplication = new RequirementsSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new ProposalSlide(w, h);
	}
	
}
