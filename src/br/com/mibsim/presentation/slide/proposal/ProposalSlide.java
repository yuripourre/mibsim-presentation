package br.com.mibsim.presentation.slide.proposal;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;
import br.com.mibsim.presentation.slide.ProblemsSlide;

public class ProposalSlide extends CommonSlide {
	
	public ProposalSlide(int w, int h) {
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
				
		drawTitle(g, "Proposta");
		drawSentence(g, 0, "Processo de colaboração entre robôs autônomos,");
		drawSentence(g, 1, "genérico o suficiente para funcionar");
		drawSentence(g, 2, "em situações diversas;");
		drawSentence(g, 3, "Considera o uso de sensores;");
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new RequirementsSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new ProblemsSlide(w, h);
	}

}
