
package com.invitation.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.invitation.service.InvitationService;

 
@RestController
@RequestMapping("/file")
public class DistanceController {
	
	@Autowired
	private InvitationService invitationService;
	
	@PostMapping("/uploadFile")
    public File uploadFile(@RequestParam("File") MultipartFile file){
		File result = invitationService.fetchUsersEligible(file);
        return result;
    }
	
	/*
	 * @GetMapping("/downloadFile/{fileName:.+}") public ResponseEntity<Resource>
	 * downloadFile(@PathVariable String fileName, HttpServletRequest request) { //
	 * Load file as Resource Resource resource =
	 * fileStorageService.loadFileAsResource(fileName);
	 * 
	 * // Try to determine file's content type String contentType = null; try {
	 * contentType =
	 * request.getServletContext().getMimeType(resource.getFile().getAbsolutePath())
	 * ; } catch (IOException ex) { logger.info("Could not determine file type."); }
	 * 
	 * // Fallback to the default content type if type could not be determined
	 * if(contentType == null) { contentType = "application/octet-stream"; }
	 * 
	 * return ResponseEntity.ok()
	 * .contentType(MediaType.parseMediaType(contentType))
	 * .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" +
	 * resource.getFilename() + "\"") .body(resource); }
	 */
}
