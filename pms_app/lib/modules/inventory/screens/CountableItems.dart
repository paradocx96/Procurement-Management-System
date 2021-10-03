import 'package:flutter/material.dart';
import 'package:pms_app/modules/inventory/models/CountableItemsModel.dart';
import 'package:pms_app/utils/services/CountableItemService.dart' as CountableItemService;

class CountableItems extends StatefulWidget {
  const CountableItems({Key? key}) : super(key: key);

  static const routeName = "/inventory/countable/get";

  @override
  _CountableItemsState createState() => _CountableItemsState();
}

class _CountableItemsState extends State<CountableItems> {

  late Future<CountableItemsModel> futureCountableItem;


  @override
  void initState() {
    super.initState();
    futureCountableItem = CountableItemService.fetchCountableItemById("6156daa173f71c13132c33b7");
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        child: Center(
          child: FutureBuilder<CountableItemsModel>(
            future: futureCountableItem,
            builder: (context,snapshot){
              if(snapshot.hasData){
                return Text(snapshot.data!.name);
              }else if (snapshot.hasError) {
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
