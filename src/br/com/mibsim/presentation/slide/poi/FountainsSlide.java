package br.com.mibsim.presentation.slide.poi;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.model.fountain.AdamantiteFountain;
import br.com.mibsim.model.fountain.WaterFountain;
import br.com.mibsim.presentation.CommonSlide;
import br.com.mibsim.presentation.slide.proposal.AgentBehaviorSlide;

public class FountainsSlide extends CommonSlide {
		
	public FountainsSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		super.load();
		
		fountains.add(new WaterFountain(200, 200));
		fountains.add(new WaterFountain(250, 212));
		fountains.add(new WaterFountain(235, 252));
		fountains.add(new WaterFountain(246, 282));
		fountains.add(new WaterFountain(346, 176));
		
		fountains.add(new AdamantiteFountain(700, 382));
		fountains.add(new AdamantiteFountain(730, 330));
		fountains.add(new AdamantiteFountain(690, 300));
				
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
				
		drawTitle(g, "Fontes de Nutrientes");
		drawSentence(g, 1, "Água");
		drawSentence(g, 2, "Adamantita");
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new AgentBehaviorSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new BasementsSlide(w, h);
	}

}
