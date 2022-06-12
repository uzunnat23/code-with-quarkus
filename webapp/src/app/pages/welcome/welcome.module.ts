import {NgModule} from '@angular/core';

import {WelcomeComponent} from './welcome.component';
import {ChildhoodComponent} from './childhood/childhood.component';
import {SelfEsteemComponent} from './self-esteem/self-esteem.component';
import {RelationshipComponent} from './relationship/relationship.component';
import {MeaningOfLifeComponent} from './meaning-of-life/meaning-of-life.component';
import {DepressionComponent} from './depression/depression.component';
import {TestBekaComponent} from './test-beka/test-beka.component';
import {TestZangaComponent} from './test-zanga/test-zanga.component';

import {WelcomeRoutingModule} from './welcome-routing.module';
import {NzAnchorModule} from "ng-zorro-antd/anchor";
import {NzAffixModule} from "ng-zorro-antd/affix";
import {ScrollingModule} from '@angular/cdk/scrolling';
import {NzListModule} from "ng-zorro-antd/list";
import {NzStepsModule} from "ng-zorro-antd/steps";
import {NzButtonModule} from "ng-zorro-antd/button";
import {CommonModule} from "@angular/common";
import {NzIconModule} from "ng-zorro-antd/icon";
import {NzRadioModule} from "ng-zorro-antd/radio";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {NzFormModule} from 'ng-zorro-antd/form';
import {NzInputModule} from "ng-zorro-antd/input";
import {NzImageModule} from "ng-zorro-antd/image";
import {NzModalModule} from "ng-zorro-antd/modal";
import { LogoutComponent } from '../logout/logout.component';
import { SendMessageComponent } from './send-message/send-message.component';
import { ReadMessageComponent } from './read-message/read-message.component';
import {NzTableModule} from "ng-zorro-antd/table";


@NgModule({
    imports: [
        WelcomeRoutingModule,
        NzAnchorModule,
        NzAffixModule,
        NzListModule,
        NzStepsModule,
        NzButtonModule,
        CommonModule,
        NzIconModule,
        NzRadioModule,
        FormsModule,
        NzFormModule,
        NzInputModule,
        ReactiveFormsModule,
        NzImageModule,
        NzModalModule,
        NzTableModule
    ],
  declarations: [
    WelcomeComponent,
    ChildhoodComponent,
    SelfEsteemComponent,
    RelationshipComponent,
    MeaningOfLifeComponent,
    DepressionComponent,
    TestBekaComponent,
    TestZangaComponent,
    LogoutComponent,
    SendMessageComponent,
    ReadMessageComponent,


  ],
  exports: [
    WelcomeComponent,
    ScrollingModule,
  ]
})
export class WelcomeModule {
}
