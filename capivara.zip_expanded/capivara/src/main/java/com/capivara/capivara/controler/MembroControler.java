package com.capivara.capivara.controler;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capivara.capivara.exception.MembroNotFoudException;
import com.capivara.capivara.model.Membro;
import com.capivara.capivara.repository.MembroRepository;
import com.capivara.capivara.service.MembroService;






@RestController
@RequestMapping("/membros")
public class MembroControler {
	 @Autowired
	private MembroRepository rm;
	
	 @Autowired
		private MembroService membroService;
	
	 @GetMapping()
	  public @ResponseBody List<Membro> listarMembro() {
	   return membroService.BuscarTodosMembros();
	  }
	 
	
	 @GetMapping("/{id}")
	  public @ResponseBody Membro ListarMembroUnico(@PathVariable(value = "id")int id) throws MembroNotFoudException {
	   return membroService.buscarMembroPorId(id);
	  }
	 
	 
	@PostMapping()
	public Membro salvarMembro(@RequestBody @Valid Membro membro) {
		return rm.save(membro);
	}
	
	@PutMapping()
	public Membro atualizarMembro(@RequestBody @Valid Membro membro) {
		return rm.save(membro);
	}
	

	@DeleteMapping("/{id}")
	public void deletarMembro(@PathVariable(value = "id")int id) throws MembroNotFoudException {
		membroService.deletarMembro(id);
	
	}

}
