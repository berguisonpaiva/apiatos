package com.capivara.capivara.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capivara.capivara.exception.MembroNotFoudException;
import com.capivara.capivara.model.Membro;
import com.capivara.capivara.repository.MembroRepository;

@Service
public class MembroService {
	
	 @Autowired
		private MembroRepository membroRepository;
	 
	 
	 public  List<Membro> BuscarTodosMembros() {
		 List<Membro> listMembros = membroRepository.findAll();

		   return listMembros;
	 }
	 
	 public Membro buscarMembroPorId(int id)throws MembroNotFoudException {
		 Optional<Membro> optionalMembro = getOptional(id);
		 Membro membro = null;
		 if(!optionalMembro.isPresent()) {
			 throw new MembroNotFoudException("Membro Não encontrado atraves do id:"+id);
		 }else {
			 membro = optionalMembro.get();
		 }
		 return membro;
	 }

	private Optional<Membro> getOptional(int id) {
		Optional<Membro> optionalMembro =  membroRepository.findById(id);
		return optionalMembro;
	}
	 
	 public void deletarMembro(int id) throws MembroNotFoudException {
		 Optional<Membro> optionalMembro = getOptional(id);
		 if(!optionalMembro.isPresent()) {
			 throw new MembroNotFoudException("Membro Não encontrado atraves do id:"+id);
		 }else {
			 membroRepository.delete(optionalMembro.get());
		 }
		
	 }

	 
}
