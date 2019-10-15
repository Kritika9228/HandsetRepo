import { Injectable } from '@angular/core';
import { Observable, of, throwError } from 'rxjs';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { catchError, tap,map } from 'rxjs/operators';
import { Handset } from '../handset/handset.ts';

/**  Constants
1- https://blog.hackages.io/angular-http-httpclient-same-but-different-86a50bbcc450
2- https://medium.com/@athif.shaffy/understanding-dependency-injection-in-angular-4a9982d7e3d6
3- https://medium.com/better-programming/angular-dependency-injection-provider-objects-f7dc363acc6c
4- https://medium.com/better-programming/error-handling-in-angular-67c308df0f07
5- https://blog.angularindepth.com/reading-the-rxjs-6-sources-map-and-pipe-94d51fec71c2
 **/
const httpOptions = {
	headers : new HttpHeaders({'Content-Type': 'application/json'})
};
const apiUrl = "/api/handsets";

@Injectable
export class HandsetService{

	constructor(private http : HttpClient){
	}
	
	private handleError<T> (operation : 'operation',result?: T){
		return (error : any) : Observable<T> =>{
			console.error(error);
			return of(result as T);
		};
	}
	
	getHandsets() : Observable<Handset[]> {
		return this.http.get<Handset[]>(apiUrl)
				.pipe(
					tap(mobiles => console.log('Fetched handset')),
					catchError(this.handleError('getProducts',[]))
				);
	}
	
	getHandset(id: number): Observable<Handset> {
  		const url = `${apiUrl}/${id}`;
 		return this.http.get<Handset>(url).pipe(
    		tap(_ => console.log(`fetched Handset id=${id}`)),
    		catchError(this.handleError<Handset>(`getHandset id=${id}`))
  	);
}
	
	addHandset(handset) : Observable<Handset>{
		return this.http.post<Handset>(apiUrl,handset,httpOptions)
			.pipe(
				tap((handset : Handset) => console.log(`added handset, id = ${handset.model_id}`)),
				catchError(this.handleError<Handset>('add handset'))
			);
	}
}