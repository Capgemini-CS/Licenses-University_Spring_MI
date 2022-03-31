package com.example.capgemini.licenseuniversity.service;

import com.example.capgemini.licenseuniversity.entity.TemeLicenta;
import com.example.capgemini.licenseuniversity.entity.dto.StudentDTO;
import com.example.capgemini.licenseuniversity.entity.dto.TemelicentaDTO;
import com.example.capgemini.licenseuniversity.repository.TemelicentaRepository;
import com.example.capgemini.licenseuniversity.service.mapper.StudentMapper;
import com.example.capgemini.licenseuniversity.service.mapper.TemelicentaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TemelicentaService {

    private final TemelicentaRepository temelicentaRepository;

    @Autowired
    public TemelicentaService(TemelicentaRepository temelicentaRepository) {
        this.temelicentaRepository = temelicentaRepository;
    }


    public List<TemelicentaDTO> getAllTemelicenta(){
        return temelicentaRepository.findAll().stream().map(TemelicentaMapper::toTemelicentaDTO).collect(Collectors.toList());
    }


    public TemelicentaDTO addTemaLicenta(TemelicentaDTO temelicentaDTO){
        TemeLicenta tema = temelicentaRepository.save(TemelicentaMapper.toTemelicenta(temelicentaDTO));
        return TemelicentaMapper.toTemelicentaDTO(tema);
    }
}
