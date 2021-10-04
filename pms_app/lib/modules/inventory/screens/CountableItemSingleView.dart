import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:pms_app/modules/inventory/models/CountableItemsModel.dart';
import 'package:pms_app/modules/inventory/routes/CountableItemSWArguments.dart';
import 'package:pms_app/utils/services/CountableItemService.dart' as CountableItemService;

class CountableItemSingleView extends StatefulWidget {
  const CountableItemSingleView({Key? key}) : super(key: key);

  static const routeName = "/inventory/countable/singleView";

  @override
  _CountableItemSingleViewState createState() => _CountableItemSingleViewState();
}

class _CountableItemSingleViewState extends State<CountableItemSingleView> {

  late Future<CountableItemsModel> futureCountableItem;



  @override
  void initState() {
    super.initState();
    //initiateFuture();
    //final args = ModalRoute.of(context)!.settings.arguments as CountableItemSWArguments;
    //futureCountableItem = CountableItemService.fetchCountableItemById(args.id);
  }

  void initiateFuture(){
    final args = ModalRoute.of(context)!.settings.arguments as CountableItemSWArguments;

    futureCountableItem = CountableItemService.fetchCountableItemById(args.id);

    /*setState(() {
      futureCountableItem = CountableItemService.fetchCountableItemById(args.id);
    });*/

  }


  @override
  Widget build(BuildContext context) {

    final args = ModalRoute.of(context)!.settings.arguments as CountableItemSWArguments;
    futureCountableItem = CountableItemService.fetchCountableItemById(args.id);

    return Scaffold(
      body: Container(
        child: Center(
          child: FutureBuilder<CountableItemsModel>(
            future: futureCountableItem,
            builder: (context,snapshot){
              if(snapshot.hasData){
                return Container(
                  height: 600,
                  child: Card(
                    child: Padding(
                      padding: const EdgeInsets.all(20.0),
                      child: Column(
                        crossAxisAlignment: CrossAxisAlignment.stretch,
                        children: [
                          Text("Id",style: TextStyle(fontSize: 25),),
                          Text(snapshot.data!.id,style: TextStyle(fontSize: 20),),
                          Spacer(),
                          Text("Name",style: TextStyle(fontSize: 25),),
                          Text(snapshot.data!.name,style: TextStyle(fontSize: 20),),
                          Spacer(),
                          Text("Type",style: TextStyle(fontSize: 25),),
                          Text(snapshot.data!.type,style: TextStyle(fontSize: 20),),
                          Spacer(),
                          Text("Quantity",style: TextStyle(fontSize: 25),),
                          Text(snapshot.data!.quantity.toString(),style: TextStyle(fontSize: 20),),
                          Spacer(),
                          Text("Minimum Quantity",style: TextStyle(fontSize: 25),),
                          Text(snapshot.data!.minimumQuantity.toString(),style: TextStyle(fontSize: 20),),
                          Spacer(),
                          Text("Site Id",style: TextStyle(fontSize: 25),),
                          Text(snapshot.data!.siteid,style: TextStyle(fontSize: 20),),
                          Spacer(),
                          Text("Site Name",style: TextStyle(fontSize: 25),),
                          Text(snapshot.data!.sitename,style: TextStyle(fontSize: 20),),
                          Spacer(),

                          ElevatedButton(onPressed: (){}, child: Text("Consume")),
                          ElevatedButton(onPressed: (){}, child: Text("Replenish")),
                        ],
                      ),
                    ),
                  ),

                );
              }
              else if(snapshot.hasError){
                return Text('${snapshot.error}');
              }

              return const CircularProgressIndicator();
            },
          ),
        ),

      ),
    );
  }
}
