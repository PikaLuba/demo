package com.spring.demo;

import com.spring.demo.app.dao.model.Note;
import com.spring.demo.app.dao.model.NoteDao;
import com.spring.demo.app.service.NoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class Hw14Application {
/*
	@RequestMapping("/")
	@ResponseBody
	Map<Long, Note> mapAll() {
		NoteService noteService = new NoteService(new NoteDao());
		Map<Long, Note> mapNote = noteService.mapAll();

		return mapNote;
	}

	@RequestMapping("/")
	@ResponseBody
	Note getById() {
		NoteService noteService = new NoteService(new NoteDao());
		Note note = noteService.getById(1l);

		return note;
	}

	@RequestMapping("/")
	@ResponseBody
	Map<Long, Note> deleteById() {
		NoteService noteService = new NoteService(new NoteDao());
		noteService.deleteById(2l);
		Map<Long, Note> mapNote = noteService.mapAll();

		return mapNote;
	}

	@RequestMapping("/")
	@ResponseBody
	Map<Long, Note> add() {
		NoteService noteService = new NoteService(new NoteDao());
		noteService.create();
		Map<Long, Note> mapNote = noteService.mapAll();
		return mapNote;
	}
*/
@RequestMapping("/")
@ResponseBody
Map<Long, Note> update() {
	NoteService noteService = new NoteService(new NoteDao());
	noteService.update();
	Map<Long, Note> mapNote = noteService.mapAll();
	return mapNote;
}
	//Hw14Application.class
	public static void main(String[] args) {
		SpringApplication.run(Hw14Application.class, args);
	}

}
