package it.prova.a2axml.web.api;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.prova.a2axml.dto.Assicurati;
import it.prova.a2axml.dto.Assicurati.Assicurato;
import it.prova.a2axml.service.AssicuratoService;

@RestController
@RequestMapping("/api/assicurato")
public class AssicuratoController {

	private String percorsoXmlInput = "C:\\provaXml\\xml\\input-xml\\Assicurati.xml";
	private String percorsoXmlError = "C:\\Users\\David\\OneDrive\\Desktop\\xml\\input-xml";

	@Autowired
	private AssicuratoService assicuratoService;

	@GetMapping
	public Assicurati start() {
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Assicurati.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Assicurati assicurati =  (Assicurati) unmarshaller.unmarshal(new File(percorsoXmlInput));
			return assicurati;

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
