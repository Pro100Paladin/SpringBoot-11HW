package ru.gb.timesheet.page;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/projects")
@RequiredArgsConstructor
public class ProjectPageController {

//    private final ProjectPageService service;
//
//    @GetMapping("/{id}")
//    public String getProjectPage(@PathVariable Long id, Model model) {
//        Optional<ProjectPageDto> projectOpt = service.findById(id);
//        if (projectOpt.isEmpty()) {
//            throw new NoSuchElementException();
//        }
//
//        model.addAttribute("project", projectOpt.get());
//        return "project-page.html";
//    }
//
//    @GetMapping
//    public String getAllProjects(Model model) {
//        List<ProjectPageDto> projects = service.findAll();
//        model.addAttribute("projects", projects);
//        return "projects-page.html";
//    }
}