package com.spring.demo.app.dao.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class NoteDao {
    private Map<Long, Note> noteMap;

    public NoteDao() {
        noteMap = new HashMap<>();
        noteMap.put(1l, new Note(1l, "breakfast", "make coffee"));
        noteMap.put(2l, new Note(2l, "shop", "buy bread"));
        noteMap.put(3l, new Note(3l, "goit", "to do homework"));
    }

    public Optional<Note> getByID(Long id) {
        if (!noteMap.containsKey(id)) {
            throw new IllegalArgumentException();
        }
        return Optional.ofNullable(noteMap.get(id));
    }

    public void deleteById(Long id) {
        if (!noteMap.containsKey(id)) {
            throw new IllegalArgumentException();
        }
        noteMap.remove(id);
    }

    public void updateNote() {
       noteMap.put(2l, new Note(2l, "supermarket", "buy water"));
    }

    public void addNote() {
        noteMap.put(4l, new Note(4l, "evening", "go to bed"));
    }

    public Map<Long, Note> mapAll() {
            return noteMap;
    }


}

