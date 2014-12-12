import br.com.etyllica.EtyllicaFrame;
import br.com.etyllica.context.Application;
import br.com.etyllica.core.loader.JoystickLoader;
import br.com.mibsim.presentation.slide.FirstSlide;
import br.com.mibsim.presentation.slide.MotivationSlide;
import br.com.mibsim.presentation.slide.ProblemsSlide;
import br.com.mibsim.presentation.slide.SolutionsSlide;
import br.com.mibsim.presentation.slide.UsageSlide;
import br.com.mibsim.presentation.slide.proposal.ProposalSlide;


public class Presentation extends EtyllicaFrame {

	private static final long serialVersionUID = 1L;

	public Presentation() {
		super(1024, 576);
	}
	
	public static void main(String[] args) {
		Presentation presentation = new Presentation();
		presentation.init();		
	}	

	@Override
	public Application startApplication() {

		String s = Presentation.class.getResource("").toString();
		setPath(s+"../");
		
		//JoystickLoader.getInstance().init(1);
		
		return new FirstSlide(w,h);
		//return new MotivationSlide(w,h);
		//return new UsageSlide(w,h);
		//return new ProblemsSlide(w,h);
		//return new SolutionsSlide(w,h);
		//return new ProposalSlide(w,h);
	}

}
