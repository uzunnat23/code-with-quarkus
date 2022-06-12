import {NgModule} from '@angular/core';
import {registerLocaleData} from '@angular/common';

import {NZ_I18N} from 'ng-zorro-antd/i18n';
import {en_US} from 'ng-zorro-antd/i18n';
import en from '@angular/common/locales/en';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';

import {BrowserModule} from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {IconsProviderModule} from './icons-provider.module';
import {NzLayoutModule} from 'ng-zorro-antd/layout';
import {NzMenuModule} from 'ng-zorro-antd/menu';
import {NzAnchorModule} from 'ng-zorro-antd/anchor';
import {ScrollingModule} from '@angular/cdk/scrolling';
import {NzButtonModule} from "ng-zorro-antd/button";
import {NzImageModule} from 'ng-zorro-antd/image';
import {NzModalModule} from "ng-zorro-antd/modal";
import {WelcomeModule} from "./pages/welcome/welcome.module";
import {LoginComponent} from './pages/login/login.component';
import {RegistrationComponent} from './pages/registration/registration.component';
import {NzFormModule} from "ng-zorro-antd/form";
import {NzIconModule} from "ng-zorro-antd/icon";

import {NzAffixModule} from "ng-zorro-antd/affix";
import {NzListModule} from "ng-zorro-antd/list";
import {NzStepsModule} from "ng-zorro-antd/steps";
import {CommonModule} from "@angular/common";
import {NzRadioModule} from "ng-zorro-antd/radio";
import {NzInputModule} from "ng-zorro-antd/input";

registerLocaleData(en);

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    IconsProviderModule,
    NzLayoutModule,
    NzMenuModule,
    NzAnchorModule,
    ScrollingModule,
    NzButtonModule,
    NzImageModule,
    NzModalModule,
    WelcomeModule,
    ReactiveFormsModule,
    NzFormModule,
    NzIconModule,
    NzAffixModule,
    NzListModule,
    NzStepsModule,
    CommonModule,
    NzRadioModule,
    NzInputModule,

  ],
  providers: [{provide: NZ_I18N, useValue: en_US}],
  bootstrap: [AppComponent],
  exports: [LoginComponent]
})
export class AppModule {
}
