import { Component } from '@angular/core';
import { HandsetService } from '../service/api.service';
@Component({
	selector : 'app-handset',
	templateUrl : './handset.component.html',
	styleUrls : ['./handset.compoenent.css']
})
export class HandsetComponent {
	constructor(apiService : HandsetService){}
}