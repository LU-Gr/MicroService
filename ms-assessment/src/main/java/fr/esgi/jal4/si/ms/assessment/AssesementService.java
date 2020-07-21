package fr.esgi.jal4.si.ms.assessment;

import org.springframework.stereotype.Service;

import fr.esgi.jal4.si.ms.assessment.Resrequest;

@Service
public class AssesementService {
	
	public String stringconcacte(Resrequest request){
		
		String requestrsp = Resrequest.getStringVal()+""+ Resrequest.getStringVal2();
		if(Resrequest.getStringVal() == null || Resrequest.getStringVal2() == null) {
			
			requestrsp = "Error ";
			
		}
		
		return requestrsp;
		
	}

}
