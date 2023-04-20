import { templateJitUrl } from "@angular/compiler";
import { Component } from "@angular/core";

@Component({
    selector: 'item',
    templateUrl: './item.component.html'
})
export class ItemComponent
{
    

    itemNo:number=100;
    itemName: string="big meat sandwich";
    itemPrice: number=12.99;
    ImageUrl:string="https://cdn.shopify.com/s/files/1/2181/5655/articles/IMG_9636-1x1-web.jpg?v=1593180818";
    

    itemNo2: number=101;
    itemName2: string="Lamb Gyro";
    itemPrice2: number=11.99;
    ImageUrl2:string="https://www.savoryexperiments.com/wp-content/uploads/2020/09/Lamb-Gyro-13.jpg";

    itemNo3: number=102;
    itemName3: string="Chicken and rice ";
    itemPrice3: number=15.50;
    ImageUrl3:string="https://dinnerthendessert.com/wp-content/uploads/2015/06/Diced-Bowl.jpg";

    itemNo4: number=104;
    itemName4: string="Lamb Chicken RIce";
    itemPrice4: number=16.99;
    ImageUrl4: string="https://www.yourhomebasedmom.com/wp-content/uploads/2016/07/Halal-Style-Chicken-and-Rice_0011-635x635.jpg";


Items ={ ItemNo:2000
}

    delete()
{
    alert("Item deleted sucessfully.");
}

display(){
    let items: Array<string>;
        items = ['big meat sandwich', 'LAMB GYRO MEAL', 'LAMB chicken rice'];
        for(var i=0; i<items.length;i++)
            {
                alert(items[i]);
            }
        }

}

