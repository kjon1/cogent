import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  //data:any;//


  //constructor(private service:AppService){}//
  
  products=[]as any;
  title = 'demo1';
  //data=[]as any;//

  ngOnInit(): void{
    this.products=this.getProduct();
    //this.data=this.service.showTable( );//

  }
  getProduct()
  {
    return[
      {'id':'100','name': 'Big meat sandwich','price': 10, 'stock':1000},
      {'id':'101','name': 'Hot spicy Lamb gyro','price': 12,'stock':700},

      {'id':'102','name': 'Lamb chicken rice','price': 8, 'stock':500},

      {'id':'103','name': 'Party platter','price': 150, 'stock':137},
      {'id':'104','name': 'Party box','price': 90, 'stock':1000},

      {'id':'105','name': 'Party plate','price': 200, 'stock':1000},

      {'id':'106','name': 'Party dish','price': 222, 'stock':1000},

      {'id':'107','name': 'Party animal','price': 90, 'stock':1000},

      {'id':'108','name': 'Party party','price': 100, 'stock':1000},

      {'id':'109','name': 'Party bucket','price': 50, 'stock':1000}



    ]

  
  }
}
