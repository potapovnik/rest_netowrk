package rest.network.controllers.abstr;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rest.network.service.abstr.CrudService;

import java.util.List;
import java.util.Map.Entry;

@RequiredArgsConstructor
public abstract class AbstractCrudEndpoint<Entity, DTO, EntityId extends Long> {

    private final CrudService<Entity, DTO, EntityId> service;

    @GetMapping("/{id}")
    public DTO getById(@PathVariable EntityId id) {
        return service.getById(id);
    }

    @GetMapping
    public List<DTO> getByIds(@RequestParam List<EntityId> ids) {
        return service.getAllByIds(ids);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable EntityId id) {
        service.deleteById(id);
    }

    @DeleteMapping
    public void deleteByIds(@RequestParam List<EntityId> ids) {
        service.deleteByIds(ids);
    }

    @PostMapping
    public void save(@RequestBody DTO dto) {
        service.save(dto);
    }
}
