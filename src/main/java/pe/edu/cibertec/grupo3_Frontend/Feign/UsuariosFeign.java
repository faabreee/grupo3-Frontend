package pe.edu.cibertec.grupo3_Frontend.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.cibertec.grupo3_Frontend.config.FeignClientConfig;
import pe.edu.cibertec.grupo3_Frontend.dto.LoginRequestDTO;
import pe.edu.cibertec.grupo3_Frontend.dto.LoginResponseDTO;

@FeignClient(name = "autenticacion", url = "http://localhost:8081/autenticacion",
        configuration = FeignClientConfig.class)
public interface UsuariosFeign {

    @PostMapping("/login")
    ResponseEntity<LoginResponseDTO> logout(@RequestBody LoginRequestDTO logoutRequestDTO);
}
