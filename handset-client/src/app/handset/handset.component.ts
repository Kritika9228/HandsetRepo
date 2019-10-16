import { Component,OnInit } from '@angular/core';
import { HandsetService } from '../service/api.service';
import { Handset } from './handset';
@Component({
	selector : 'app-handset',
	templateUrl : './handset.component.html',
	styleUrls : ['./handset.component.css']
})
export class HandsetComponent implements OnInit {
	displayedColumns : string[] = ['model_name','price'];
	data : Handset[] =[];
	isLoadingResults =true;
	
	constructor(apiService : HandsetService){}
	
	ngOnInit(){
		this.apiService.getHandsets()
		.subscribe(res => {
			this.data=res;
			console.log(this.data);
			this.loadingResults = false;
		}, err=>{
			console.log(err);
			this.loadingResults = false;
		});
	}
}