package pack.mypack.manoj.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pack.mypack.manoj.model.Contact;
import pack.mypack.manoj.service.Service;

@Controller
@RequestMapping("/")
public class HelloWorldController {
	
	private final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);
	
	@Autowired
	private Service<Contact> contactService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String helloWorld(Model model){
		
		LOG.debug("TULU MSG : Inside helloWorld.GET()");
		model.addAttribute("contactDTO", new Contact());
		return "helloWorld";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String showContact(@ModelAttribute("contactDTO") Contact contact, BindingResult result, Model Model){
		
		LOG.debug("TULU MSG : Inside showContact.POST() : Recieved Contact is : " + contact );
		
		Contact savedContact = contactService.save(contact);
		
		Model.addAttribute("savedContact", savedContact);
		
		LOG.debug("TULU MSG : Inside showContact.POST() : Saved Contact is : " + savedContact );
		
		return "contactBook";
	}
	
	@ModelAttribute("listofcontact")
	public List<Contact> listContacts(){
		List<Contact> contactList=contactService.list();
		return contactList;
	}

}
