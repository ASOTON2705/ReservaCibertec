package com.cibertec.reservabacksoto.mappers;

import com.cibertec.reservabacksoto.dtos.SedeCreateDTO;
import com.cibertec.reservabacksoto.dtos.SedeDTO;
import com.cibertec.reservabacksoto.dtos.SedeUpdateDTO;
import com.cibertec.reservabacksoto.model.Sede;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface SedeMapper {
    SedeMapper instancia= Mappers.getMapper(SedeMapper.class);
    SedeDTO sedeASedeDTO(Sede sede);
    Sede sedeDTOASede(SedeDTO sedeDTO);
    Sede sedeCreateDTOASede(SedeCreateDTO sedeCreateDTO);
    Sede sedeUpdateDTOASede(SedeUpdateDTO sedeUpdateDTO);
    List<SedeDTO> listaSedeAListaSedeDTO (List<Sede> listaSede);
}
