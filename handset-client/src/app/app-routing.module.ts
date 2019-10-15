import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HandsetComponent } from './handset/handset.component';
import { HandsetAddComponent } from './handset-add/handset-add.component';
import { HandsetDetailComponent } from './handset-detail/handset-detail.component';
import { HandsetEditComponent } from './handset-edit/handset-edit.component';

const routes: Routes = [
	{
		path : 'handsets',
		component : HandsetComponent,
		data : {title : 'List of Handsets'}
	},
	{
		path : 'handset-add',
		component : HandsetAddComponent,
		data : {title : 'Add Handset'}
	},
	{
		path : 'handset-details/:id',
		component : HandsetDetailComponent,
		data : {title : 'Handsets Details'}
	},
	{
		path : 'handset-edit/:id',
		component : HandsetEditComponent,
		data : {title : 'Edit Product'}
	},
	{
		path : '',
		redirectTo : '/handsets',
		pathMatch : 'full'
	}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
