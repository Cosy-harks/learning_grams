import { Component, OnInit } from '@angular/core';
import { GitService } from '../git.service';
import { User } from './user.class';

@Component({
  selector: 'app-gitapi',
  templateUrl: './gitapi.component.html',
  styleUrls: ['./gitapi.component.css'],
  providers: [GitService]
})
export class GitapiComponent implements OnInit {
	private users:User[];
	constructor(private gitService:GitService) {}

	ngOnInit() {
		//putting observables into users
		this.gitService.getGitUsersList().subscribe(data=>{
			this.users = data;
		})
	}

}
