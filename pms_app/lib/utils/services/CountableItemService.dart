import 'dart:convert';

import 'package:http/http.dart' as http;
import 'package:pms_app/modules/inventory/models/CountableItemsModel.dart';

Future<CountableItemsModel> fetchCountableItemById(id) async{
  final response =
  await http.get(Uri.parse
    ("http://192.168.1.7:5000/api/inventory/countable/getCountableItemById/6156daa173f71c13132c33b7"));

  if(response.statusCode == 200){
    return CountableItemsModel.fromjson(jsonDecode(response.body));
  }
  else{
    throw Exception('Failed to fetch countable item');
  }
}