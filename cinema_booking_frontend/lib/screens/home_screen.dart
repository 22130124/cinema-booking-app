// Các màn hình
import 'package:flutter/material.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Danh sách phim')),
      body: const Center(child: Text('Chào mừng đến với Cinema Booking App')),
    );
  }
}