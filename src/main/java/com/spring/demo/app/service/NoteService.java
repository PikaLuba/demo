package com.spring.demo.app.service;

import com.spring.demo.app.dao.model.Note;
import com.spring.demo.app.dao.model.NoteDao;
import com.spring.demo.app.exeption.BadRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteDao noteDao;

    public Note getById(Long id) {

        return noteDao.getByID(id).orElseThrow(BadRequestException::new);
    }

    public void deleteById(Long id) {
        noteDao.deleteById(id);
    }

    public Map<Long, Note> mapAll() {
        return noteDao.mapAll();
    }

    public void create() {
        noteDao.addNote();
    }

    public void update() {
        noteDao.updateNote();
    }

}

