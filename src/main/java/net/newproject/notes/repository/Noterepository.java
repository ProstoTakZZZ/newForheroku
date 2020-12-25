package net.newproject.notes.repository;

import net.newproject.notes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Noterepository extends JpaRepository<Note, Long> {

}
