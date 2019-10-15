import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HandsetComponent } from './handset/handset.component';
import { HandsetAddComponent } from './handset-add/handset-add.component';
import { HandsetDetailComponent } from './handset-detail/handset-detail.component';
import { HandsetEditComponent } from './handset-edit/handset-edit.component';
import { HandsetService } from './service/api.service';


@NgModule({
  declarations: [
    AppComponent,
    HandsetComponent,
    HandsetAddComponent,
    HandsetDetailComponent,
    HandsetEditComponent
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [HandsetService],
  bootstrap: [AppComponent]
})
export class AppModule { }
