import { Component, Inject, OnInit } from '@angular/core';
import { Router, Routes } from '@angular/router';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})

export class SidebarComponent implements OnInit {

  constructor(private router: Router) { }
  // 

  ngOnInit(): void {
  }

  routerHome(){
    window.location.href = "home";
  }

}
