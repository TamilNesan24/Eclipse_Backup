
import javax.servlet.http.*;

@Controller
public class MyController{
	
	@RequestMapping("/display")
	public String display()
	{
		return "NewDisplay.html";
		
	}
}
 