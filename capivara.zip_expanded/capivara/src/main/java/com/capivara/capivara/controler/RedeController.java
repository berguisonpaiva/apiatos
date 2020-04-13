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


import com.capivara.capivara.model.Rede;
import com.capivara.capivara.repository.RedeRepository;



@RestController
@RequestMapping("/redes")
public class RedeController {
	 @Autowired
		private RedeRepository repo;
	 @GetMapping()
	  public @ResponseBody List<Rede> listarRede() {
	   return repo.findAll();
	  }
	 @GetMapping("/{id}")
	  public @ResponseBody Rede ListarRedeUnica(@PathVariable(value = "id")int id) {
	   return repo.findById(id);
	  }
	 
	@PostMapping()
	public Rede salvarRede(@RequestBody @Valid Rede rede) {
		return repo.save(rede);
	}
	
	@PutMapping()
	public Rede atualizarRede(@RequestBody @Valid Rede rede) {
		return repo.save(rede);
	}
	
	@DeleteMapping("/{id}")
	public void deletarRede(@PathVariable(value = "id")int id) {
		repo.deleteById(id);
	

}
}
