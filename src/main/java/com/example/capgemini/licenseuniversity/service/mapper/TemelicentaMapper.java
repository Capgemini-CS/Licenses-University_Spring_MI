package com.example.capgemini.licenseuniversity.service.mapper;

import com.example.capgemini.licenseuniversity.entity.TemeLicenta;
import com.example.capgemini.licenseuniversity.entity.dto.TemelicentaDTO;

public class TemelicentaMapper {

    public static TemelicentaDTO toTemelicentaDTO(TemeLicenta temeLicenta){
        TemelicentaDTO temelicentaDTO = new TemelicentaDTO();

        temelicentaDTO.setHomework_id(temeLicenta.getHomework_id());
        temelicentaDTO.setName(temeLicenta.getName());
        temelicentaDTO.setNoPages(temeLicenta.getNoPages());
        temelicentaDTO.setHasApplication(temeLicenta.isHasApplication());
        temelicentaDTO.setStudent(temeLicenta.getStudent());
        temelicentaDTO.setProfesor(temeLicenta.getProfesor());

        return temelicentaDTO;
    }


    public static TemeLicenta toTemelicenta(TemelicentaDTO temelicentaDTO){
        TemeLicenta temeLicenta = new TemeLicenta();

        temeLicenta.setHomework_id(temelicentaDTO.getHomework_id());
        temeLicenta.setName(temelicentaDTO.getName());
        temeLicenta.setNoPages(temelicentaDTO.getNoPages());
        temeLicenta.setHasApplication(temelicentaDTO.isHasApplication());
        temeLicenta.setStudent(temelicentaDTO.getStudent());
        temeLicenta.setProfesor(temelicentaDTO.getProfesor());

        return temeLicenta;
    }

}
