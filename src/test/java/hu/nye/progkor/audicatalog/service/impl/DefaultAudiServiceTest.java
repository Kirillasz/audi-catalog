package hu.nye.progkor.audicatalog.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import hu.nye.progkor.audicatalog.data.model.Audi;
import hu.nye.progkor.audicatalog.data.model.Type;
import hu.nye.progkor.audicatalog.data.repository.Repository;
import hu.nye.progkor.audicatalog.service.AudiService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

public class DefaultAudiServiceTest {

    private static final Long DUMMY_AUDI_ID = 1L;

    private static final Audi DUMMY_AUDI = new Audi(DUMMY_AUDI_ID, Type.A3,1999,"diesel","8",300,"kek");

    @Mock
    private Repository<Audi, Long> audiRepository;

    private AudiService underTest;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        underTest = new DefaultAudiService(audiRepository);
    }

    @Test
    void createAudiShouldDelegateToTheRepositoryAndReturnSavedAudi() {
        // Given
        given(audiRepository.save(DUMMY_AUDI)).willReturn(DUMMY_AUDI);

        // When
        final Audi actual = underTest.createAudi(DUMMY_AUDI);

        // Then
        assertThat(actual, equalTo(DUMMY_AUDI));
        verify(audiRepository).save(DUMMY_AUDI);
        verifyNoMoreInteractions(audiRepository);
    }

    @Test
    void retrieveAllAudiShouldDelegateToTheRepositoryAndReturnAllFoundAudis() {
        // Given
        given(audiRepository.getAll()).willReturn(List.of(DUMMY_AUDI));

        // When
        final List<Audi> actual = underTest.retrieveAllAudi();

        // Then
        assertThat(actual, equalTo(List.of(DUMMY_AUDI)));
        verify(audiRepository).getAll();
        verifyNoMoreInteractions(audiRepository);
    }

}
