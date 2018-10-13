package requestHandler.springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import businessFeature.MessageFeature;
import businessObject.Message;

@RestController
public class MessageRestController {
	@RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }
 
    @RequestMapping(value = "/message/{name}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Message> readMessage(@PathVariable String name) {
        return new ResponseEntity<Message>(MessageFeature.readMessage(name), HttpStatus.OK);
    }

    @RequestMapping(value = "/message", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void putMessage(@RequestBody Message message) {
    	MessageFeature.createOrUpdateMessage(message);
    }
}
