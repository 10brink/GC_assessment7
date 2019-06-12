package co.grandcircus.assessment7b;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

//Code written by Nick TenBrink
@Controller
public class ParkController {
	RestTemplate rt = new RestTemplate();


	@RequestMapping("/")
	public ModelAndView index() {
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "nick");
		
		String url = "https://gc-parks.surge.sh/api/parks.json";
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<ParkList> response = rt.exchange(url, HttpMethod.GET, entity, ParkList.class);
		
		
		ModelAndView mv = new ModelAndView("home", "parks",response.getBody().getParks() );
		return mv;
	}
	
	@RequestMapping("/details")
	public ModelAndView details(@RequestParam("id") int id){
	
		String url = "https://gc-parks.surge.sh/api/parks/" +String.valueOf(id)+".json";

		HttpEntity<String> entity = new HttpEntity<>("parameters");
		ResponseEntity<Park> response = rt.exchange(url, HttpMethod.GET, entity, Park.class);
		
		
		ModelAndView mv = new ModelAndView("details", "Park", response.getBody());
		return mv;
	}
	
}
