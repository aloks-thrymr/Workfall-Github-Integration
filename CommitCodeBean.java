package net.thrymr.beans;

import java.util.Date;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import net.thrymr.models.AppUser;
import net.thrymr.models.Project;

public class CommitCodeBean {
public String commitId;
	

	public String projectname;
	
	public String commitMessage;
	
	public Date commitDate;


}
