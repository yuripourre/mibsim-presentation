import br.com.etyllica.EtyllicaFrame;
import br.com.etyllica.context.Application;
import br.com.mibsim.presentation.CommonSlide;


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
		
		return new CommonSlide(w,h);
	}

}
