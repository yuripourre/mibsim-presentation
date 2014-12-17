package br.com.mibsim.presentation.slide.proposal;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;
import br.com.mibsim.presentation.slide.conclusion.ConclusionSlide;
import br.com.mibsim.presentation.slide.poi.FountainsSlide;

public class AgentBehaviorSlide extends CommonSlide {
	
	public AgentBehaviorSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		super.load();
		
		//draw more complex background
		//agents dying
				
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
				
		drawTitle(g, "Comportamento dos Agentes");
		drawSentence(g, 0, "Os agentes vão até a base e recebem uma designação.");
		drawSentence(g, 1, "Exploram o setor designado e retornam para a base.");
		drawSentence(g, 2, "Quando sentem fome, suspendem a tarefa e andam");
		drawSentence(g, 3, "até a fonte de nutrientes mais próxima.");
		
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new ConclusionSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new FountainsSlide(w, h);
	}

}
